package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * lge device specifications for Android Compose previews.
 *
 * This extension provides lge device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lge.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lge: Any
  get() = object {
      /** lge acelm */
      val ACELM = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** lge acexlm */
      val ACEXLM = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** lge aka */
      val AKA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge alicee */
      val ALICEE = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** lge alphaamz */
      val ALPHAAMZ = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** lge alphalm */
      val ALPHALM = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** lge alphaplus */
      val ALPHAPLUS = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** lge altev */
      val ALTEV = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** lge altev2 */
      val ALTEV2 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** lge angelfish */
      val ANGELFISH = "spec:width=360,height=360,unit=px,dpi=300"

      /** lge anna */
      val ANNA = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** lge awifi */
      val AWIFI = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** lge awifi070u */
      val AWIFI070U = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** lge b1 */
      val B1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge b1w */
      val B1W = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge b2l */
      val B2L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge b2lds */
      val B2LDS = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge b2ldsn */
      val B2LDSN = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge b2ln */
      val B2LN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge b2lss */
      val B2LSS = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge b2lssn */
      val B2LSSN = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge b3 */
      val B3 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** lge b5 */
      val B5 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** lge b6 */
      val B6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** lge bass */
      val BASS = "spec:width=320,height=320,unit=px,dpi=240"

      /** lge bbg */
      val BBG = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge betalm */
      val BETALM = "spec:width=1080,height=2248,unit=px,dpi=420"

      /** lge c100 */
      val C100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge c100n */
      val C100N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge c50 */
      val C50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge c50ds */
      val C50DS = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge c50n */
      val C50N = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge c70 */
      val C70 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge c70ds */
      val C70DS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge c70n */
      val C70N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge c70w */
      val C70W = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge c90 */
      val C90 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge c90n */
      val C90N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge c90nas */
      val C90NAS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge caymanlm */
      val CAYMANLM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** lge caymanslm */
      val CAYMANSLM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** lge cf */
      val CF = "spec:width=320,height=480,unit=px,dpi=160"

      /** lge cf2 */
      val CF2 = "spec:width=480,height=844,unit=px,dpi=240"

      /** lge cv1 */
      val CV1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge cv109 */
      val CV109 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge cv1s */
      val CV1S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge cv3 */
      val CV3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge cv3n */
      val CV3N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge cv5a */
      val CV5A = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** lge cv5an */
      val CV5AN = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** lge cv7a */
      val CV7A = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** lge cv7an */
      val CV7AN = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** lge cv7as */
      val CV7AS = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** lge cv7as-pr */
      val CV7AS_PR = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** lge d2 */
      val D2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge d3 */
      val D3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge dh0lm */
      val DH0LM = "spec:width=720,height=1520,unit=px,dpi=320"

      /** lge DM-01G */
      val DM_01G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge DM-01K */
      val DM_01K = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** lge DM-02H */
      val DM_02H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge e1q */
      val E1Q = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge e2 */
      val E2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge e2n */
      val E2N = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge e2nac */
      val E2NAC = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge e2nas */
      val E2NAS = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge e2nav */
      val E2NAV = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge e7iilte */
      val E7IILTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** lge e7lte */
      val E7LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** lge e7wifi */
      val E7WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** lge e8lte */
      val E8LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** lge e8wifi */
      val E8WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** lge e9lte */
      val E9LTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** lge e9wifi */
      val E9WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** lge e9wifin */
      val E9WIFIN = "spec:width=800,height=1280,unit=px,dpi=160"

      /** lge elsa */
      val ELSA = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** lge f6 */
      val F6 = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge f70n */
      val F70N = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge falcon */
      val FALCON = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** lge fh50lm */
      val FH50LM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** lge flashlm */
      val FLASHLM = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** lge flashlmdd */
      val FLASHLMDD = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** lge fx1sk */
      val FX1SK = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge g2 */
      val G2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge g2m */
      val G2M = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge g2mds */
      val G2MDS = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge g2mss */
      val G2MSS = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge g2mv */
      val G2MV = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge g3 */
      val G3 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** lge g4stylus */
      val G4STYLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge g4stylusc */
      val G4STYLUSC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge g4stylusds */
      val G4STYLUSDS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge g4stylusdsn */
      val G4STYLUSDSN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge g4stylusn */
      val G4STYLUSN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge g4stylusw */
      val G4STYLUSW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge geefhd */
      val GEEFHD = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge geefhd4g */
      val GEEFHD4G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge geehdc */
      val GEEHDC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge geehrc */
      val GEEHRC = "spec:width=768,height=1280,unit=px,dpi=320"

      /** lge geehrc4g */
      val GEEHRC4G = "spec:width=768,height=1280,unit=px,dpi=320"

      /** lge h1 */
      val H1 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** lge hg2 */
      val HG2 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** lge hg2_iot */
      val HG2_IOT = "spec:width=720,height=1280,unit=px,dpi=213"

      /** lge jag3gds */
      val JAG3GDS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge jag3gss */
      val JAG3GSS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge jagn */
      val JAGN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge jagnm */
      val JAGNM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge jettalt */
      val JETTALT = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** lge joan */
      val JOAN = "spec:width=1440,height=2880,unit=px,dpi=640"

      /** lge judyln */
      val JUDYLN = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** lge judyp */
      val JUDYP = "spec:width=1440,height=2880,unit=px,dpi=560"

      /** lge judypn */
      val JUDYPN = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** lge k5 */
      val K5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge k5n */
      val K5N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge k6b */
      val K6B = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge k6p */
      val K6P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge k7 */
      val K7 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge k7n */
      val K7N = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge L05E */
      val L05E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge l1e */
      val L1E = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge l70p */
      val L70P = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge l70pds */
      val L70PDS = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge l70pn */
      val L70PN = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge l9ii */
      val L9II = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge lenok */
      val LENOK = "spec:width=320,height=320,unit=px,dpi=240"

      /** lge liger */
      val LIGER = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge LMX130IM */
      val LMX130IM = "spec:width=720,height=1500,unit=px,dpi=320"

      /** lge LM-X440IM */
      val LM_X440IM = "spec:width=720,height=1520,unit=px,dpi=280"

      /** lge LM-X440ZM */
      val LM_X440ZM = "spec:width=720,height=1520,unit=px,dpi=280"

      /** lge LM-X440ZMW */
      val LM_X440ZMW = "spec:width=720,height=1520,unit=px,dpi=280"

      /** lge lo_1 */
      val LO_1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge lucye */
      val LUCYE = "spec:width=1440,height=2880,unit=px,dpi=640"

      /** lge luv20ds */
      val LUV20DS = "spec:width=240,height=320,unit=px,dpi=120"

      /** lge luv20ss */
      val LUV20SS = "spec:width=240,height=320,unit=px,dpi=120"

      /** lge luv20ts */
      val LUV20TS = "spec:width=240,height=320,unit=px,dpi=120"

      /** lge luv30ds */
      val LUV30DS = "spec:width=240,height=320,unit=px,dpi=120"

      /** lge luv30ss */
      val LUV30SS = "spec:width=240,height=320,unit=px,dpi=120"

      /** lge luv50ds */
      val LUV50DS = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge luv50ss */
      val LUV50SS = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge luv50ssn */
      val LUV50SSN = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge luv80ds */
      val LUV80DS = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge luv80ss */
      val LUV80SS = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge luv90ds */
      val LUV90DS = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge luv90ss */
      val LUV90SS = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge lv0 */
      val LV0 = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge lv1 */
      val LV1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge lv3 */
      val LV3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge lv3n */
      val LV3N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge lv517 */
      val LV517 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge lv517n */
      val LV517N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge lv7 */
      val LV7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge lv9 */
      val LV9 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge lv9n */
      val LV9N = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge L-01J */
      val L_01J = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** lge L-01K */
      val L_01K = "spec:width=1440,height=2880,unit=px,dpi=640"

      /** lge L-01L */
      val L_01L = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** lge L-02K */
      val L_02K = "spec:width=1440,height=2880,unit=px,dpi=640"

      /** lge L-03K */
      val L_03K = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** lge L-41A */
      val L_41A = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** lge L-51A */
      val L_51A = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** lge L-52A */
      val L_52A = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** lge l_dcm */
      val L_DCM = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge m1 */
      val M1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge m13g */
      val M13G = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge m1ds */
      val M1DS = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge m1v */
      val M1V = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge m209 */
      val M209 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge m209n */
      val M209N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge m216 */
      val M216 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge m216n */
      val M216N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge m23g */
      val M23G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge m253 */
      val M253 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge m253n */
      val M253N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge m4 */
      val M4 = "spec:width=320,height=480,unit=px,dpi=160"

      /** lge mc90 */
      val MC90 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mc90ds */
      val MC90DS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mcaymanlm */
      val MCAYMANLM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** lge mcv150 */
      val MCV150 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mcv1s */
      val MCV1S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mcv3 */
      val MCV3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mcv5a */
      val MCV5A = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** lge mcv7a */
      val MCV7A = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** lge mdh10lm */
      val MDH10LM = "spec:width=720,height=1560,unit=px,dpi=280"

      /** lge mdh10xlm */
      val MDH10XLM = "spec:width=720,height=1560,unit=px,dpi=280"

      /** lge mdh15lm */
      val MDH15LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** lge mdh30lm */
      val MDH30LM = "spec:width=720,height=1560,unit=px,dpi=280"

      /** lge mdh30xlm */
      val MDH30XLM = "spec:width=720,height=1560,unit=px,dpi=280"

      /** lge mdh35lm */
      val MDH35LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** lge mdh40lm */
      val MDH40LM = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** lge mdh50lm */
      val MDH50LM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** lge mdh5lm */
      val MDH5LM = "spec:width=720,height=1520,unit=px,dpi=280"

      /** lge me0 */
      val ME0 = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge me1 */
      val ME1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge me1ds */
      val ME1DS = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge meh15lm */
      val MEH15LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** lge meh20lm */
      val MEH20LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** lge meh35lm */
      val MEH35LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** lge mfh10lm */
      val MFH10LM = "spec:width=720,height=1600,unit=px,dpi=320"

      /** lge mh2lm */
      val MH2LM = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** lge mh3 */
      val MH3 = "spec:width=1080,height=2310,unit=px,dpi=420"

      /** lge mh3-pl */
      val MH3_PL = "spec:width=1080,height=2310,unit=px,dpi=420"

      /** lge mh4 */
      val MH4 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** lge mh4x */
      val MH4X = "spec:width=720,height=1440,unit=px,dpi=280"

      /** lge mh4-pr */
      val MH4_PR = "spec:width=720,height=1440,unit=px,dpi=280"

      /** lge mh5lm */
      val MH5LM = "spec:width=720,height=1440,unit=px,dpi=280"

      /** lge mh5lm-8m */
      val MH5LM_8M = "spec:width=720,height=1440,unit=px,dpi=280"

      /** lge mhn */
      val MHN = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** lge mk6m */
      val MK6M = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mk6p */
      val MK6P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mk6p55 */
      val MK6P55 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mk6pn */
      val MK6PN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mlv1 */
      val MLV1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge mlv3 */
      val MLV3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mlv5 */
      val MLV5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mlv5n */
      val MLV5N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mlv7 */
      val MLV7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mlv7n */
      val MLV7N = "spec:width=720,height=1280,unit=px,dpi=280"

      /** lge mm1v */
      val MM1V = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mm1vn */
      val MM1VN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mme0 */
      val MME0 = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge mme0n */
      val MME0N = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge mmh4 */
      val MMH4 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** lge mmh45lm */
      val MMH45LM = "spec:width=720,height=1560,unit=px,dpi=280"

      /** lge mmh4p */
      val MMH4P = "spec:width=720,height=1520,unit=px,dpi=280"

      /** lge mmh4p-pr */
      val MMH4P_PR = "spec:width=720,height=1520,unit=px,dpi=280"

      /** lge mmh4x */
      val MMH4X = "spec:width=720,height=1440,unit=px,dpi=280"

      /** lge mmh55lm */
      val MMH55LM = "spec:width=720,height=1560,unit=px,dpi=280"

      /** lge mmh5lm */
      val MMH5LM = "spec:width=720,height=1440,unit=px,dpi=280"

      /** lge mmh6lm */
      val MMH6LM = "spec:width=480,height=960,unit=px,dpi=240"

      /** lge mp1s3gds */
      val MP1S3GDS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mp1s3gss */
      val MP1S3GSS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mph1 */
      val MPH1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge msf3 */
      val MSF3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge msf3n */
      val MSF3N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge mth8 */
      val MTH8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** lge mw41lm */
      val MW41LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** lge my50 */
      val MY50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge my50ds */
      val MY50DS = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge my70 */
      val MY70 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge my70ds */
      val MY70DS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge my90 */
      val MY90 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge my90ds */
      val MY90DS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge narwhal */
      val NARWHAL = "spec:width=360,height=360,unit=px,dpi=300"

      /** lge nemo */
      val NEMO = "spec:width=480,height=480,unit=px,dpi=340"

      /** lge Neo11LM */
      val NEO11LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** lge Neo2ALP */
      val NEO2ALP = "spec:width=720,height=1520,unit=px,dpi=320"

      /** lge Neo31LM */
      val NEO31LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** lge Neo4LM */
      val NEO4LM = "spec:width=720,height=1520,unit=px,dpi=320"

      /** lge omega */
      val OMEGA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge p1 */
      val P1 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** lge p1bds3g */
      val P1BDS3G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge p1bdsn */
      val P1BDSN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge p1bssn */
      val P1BSSN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge p1v */
      val P1V = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge ph1 */
      val PH1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge ph1n */
      val PH1N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge ph2 */
      val PH2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge ph2n */
      val PH2N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge phoenix_sprout */
      val PHOENIX_SPROUT = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** lge pplus */
      val PPLUS = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** lge rainbowlm */
      val RAINBOWLM = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** lge sf317 */
      val SF317 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge sf340 */
      val SF340 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge sf340n */
      val SF340N = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge sjr */
      val SJR = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** lge solemiolt */
      val SOLEMIOLT = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** lge swordfish */
      val SWORDFISH = "spec:width=480,height=480,unit=px,dpi=340"

      /** lge t1lte */
      val T1LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** lge t1wifi */
      val T1WIFI = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** lge t1wifin */
      val T1WIFIN = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** lge t8lte */
      val T8LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** lge t8wi7u */
      val T8WI7U = "spec:width=800,height=1280,unit=px,dpi=213"

      /** lge t8wifi */
      val T8WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** lge tf10 */
      val TF10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** lge tf10w */
      val TF10W = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** lge tf840 */
      val TF840 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** lge th10 */
      val TH10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** lge tiger6 */
      val TIGER6 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** lge tigers */
      val TIGERS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge timelm */
      val TIMELM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** lge tvg2 */
      val TVG2 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** lge u2 */
      val U2 = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge v1 */
      val V1 = "spec:width=240,height=320,unit=px,dpi=120"

      /** lge v10 */
      val V10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge v1ds */
      val V1DS = "spec:width=240,height=320,unit=px,dpi=120"

      /** lge vee3ds */
      val VEE3DS = "spec:width=240,height=320,unit=px,dpi=120"

      /** lge vee3e */
      val VEE3E = "spec:width=240,height=320,unit=px,dpi=120"

      /** lge vee4ss */
      val VEE4SS = "spec:width=320,height=480,unit=px,dpi=160"

      /** lge vee5ds */
      val VEE5DS = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge vee5nfc */
      val VEE5NFC = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge vee5ss */
      val VEE5SS = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge vee7ds */
      val VEE7DS = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge vee7e */
      val VEE7E = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge vfp */
      val VFP = "spec:width=320,height=480,unit=px,dpi=160"

      /** lge vfp3g */
      val VFP3G = "spec:width=320,height=480,unit=px,dpi=160"

      /** lge vfpv */
      val VFPV = "spec:width=320,height=480,unit=px,dpi=160"

      /** lge vu2kt */
      val VU2KT = "spec:width=768,height=1024,unit=px,dpi=320"

      /** lge vu2sk */
      val VU2SK = "spec:width=768,height=1024,unit=px,dpi=320"

      /** lge vu3 */
      val VU3 = "spec:width=960,height=1280,unit=px,dpi=320"

      /** lge w3 */
      val W3 = "spec:width=320,height=480,unit=px,dpi=160"

      /** lge w3c */
      val W3C = "spec:width=320,height=480,unit=px,dpi=160"

      /** lge w3ds */
      val W3DS = "spec:width=320,height=480,unit=px,dpi=160"

      /** lge w3voip */
      val W3VOIP = "spec:width=320,height=480,unit=px,dpi=160"

      /** lge w5 */
      val W5 = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge w55 */
      val W55 = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge w55ds */
      val W55DS = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge w55n */
      val W55N = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge w5c */
      val W5C = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge w5ds */
      val W5DS = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge w5n */
      val W5N = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge w6 */
      val W6 = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge w6ds */
      val W6DS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge w7 */
      val W7 = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge w7ds */
      val W7DS = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge w7dsn */
      val W7DSN = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge w7n */
      val W7N = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge winglm */
      val WINGLM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** lge x10 */
      val X10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge x5 */
      val X5 = "spec:width=540,height=960,unit=px,dpi=240"

      /** lge y25 */
      val Y25 = "spec:width=320,height=480,unit=px,dpi=160"

      /** lge y25c */
      val Y25C = "spec:width=320,height=480,unit=px,dpi=160"

      /** lge y30 */
      val Y30 = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge y30dsf */
      val Y30DSF = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge y30f */
      val Y30F = "spec:width=480,height=800,unit=px,dpi=240"

      /** lge y50 */
      val Y50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge y50c */
      val Y50C = "spec:width=480,height=854,unit=px,dpi=240"

      /** lge yg */
      val YG = "spec:width=720,height=1280,unit=px,dpi=320"

      /** lge z2 */
      val Z2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** lge zee */
      val ZEE = "spec:width=720,height=1280,unit=px,dpi=320"

  }
