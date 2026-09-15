const stats = [
  { label: 'Applications', value: '128' },
  { label: 'Interviews', value: '22' },
  { label: 'Offers', value: '4' },
  { label: 'Follow-ups due', value: '7' },
];

const pipeline = [
  'Upload resume and ingest job postings',
  'Extract skills, experience, and achievements',
  'Generate tailored cover letters and follow-ups',
  'Track recruiter outreach and status changes',
];

export default function HomePage() {
  return (
    <main style={{ fontFamily: 'sans-serif', padding: '32px', maxWidth: '1200px', margin: '0 auto' }}>
      <section style={{ display: 'grid', gap: '24px', gridTemplateColumns: '1.5fr 1fr', alignItems: 'center' }}>
        <div>
          <p style={{ textTransform: 'uppercase', letterSpacing: '0.08em', color: '#4f46e5', fontWeight: 700 }}>AI Job Application Tracker</p>
          <h1 style={{ fontSize: '3rem', margin: '0 0 20px' }}>Smarter job search, less manual work.</h1>
          <p style={{ fontSize: '1.1rem', lineHeight: 1.7, color: '#374151', maxWidth: '700px' }}>
            Manage applications, keep recruiter communication organized, and let Gemini generate tailored follow-ups,
            cover letters, and outreach drafts from your resume intelligence.
          </p>
          <div style={{ display: 'flex', gap: '16px', marginTop: '24px', flexWrap: 'wrap' }}>
            <button style={{ background: '#4f46e5', color: 'white', border: 'none', padding: '14px 20px', borderRadius: '12px', fontWeight: 600 }}>Get Started</button>
            <button style={{ background: '#eef2ff', color: '#312e81', border: 'none', padding: '14px 20px', borderRadius: '12px', fontWeight: 600 }}>View Demo</button>
          </div>
        </div>

        <div style={{ background: '#111827', color: 'white', borderRadius: '20px', padding: '28px', boxShadow: '0 24px 64px rgba(17,24,39,0.15)' }}>
          <h3 style={{ marginTop: 0 }}>Pipeline Overview</h3>
          <ul style={{ listStyle: 'none', padding: 0, margin: 0, display: 'grid', gap: '16px' }}>
            {pipeline.map((step, index) => (
              <li key={step} style={{ display: 'flex', gap: '12px', alignItems: 'center' }}>
                <span style={{ width: '28px', height: '28px', borderRadius: '999px', background: '#4f46e5', display: 'inline-flex', alignItems: 'center', justifyContent: 'center', fontWeight: 700 }}>{index + 1}</span>
                <span>{step}</span>
              </li>
            ))}
          </ul>
        </div>
      </section>

      <section style={{ marginTop: '48px', display: 'grid', gridTemplateColumns: 'repeat(4, minmax(0, 1fr))', gap: '20px' }}>
        {stats.map((stat) => (
          <div key={stat.label} style={{ background: '#f8fafc', border: '1px solid #e2e8f0', borderRadius: '16px', padding: '24px' }}>
            <p style={{ margin: 0, color: '#64748b', fontSize: '0.95rem' }}>{stat.label}</p>
            <h2 style={{ margin: '12px 0 0', fontSize: '2rem' }}>{stat.value}</h2>
          </div>
        ))}
      </section>
    </main>
  );
}
