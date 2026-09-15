import './globals.css';
import type { Metadata } from 'next';

export const metadata: Metadata = {
  title: 'AI Job Application Tracker',
  description: 'Track applications, resume intelligence, follow-ups, and recruiter outreach.',
};

export default function RootLayout({ children }: { children: React.ReactNode }) {
  return (
    <html lang="en">
      <body>{children}</body>
    </html>
  );
}
