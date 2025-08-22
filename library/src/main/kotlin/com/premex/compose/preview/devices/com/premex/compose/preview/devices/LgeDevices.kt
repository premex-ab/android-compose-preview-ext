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
      /** DeviceSpec(manufacturer=lge, code=acelm, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=acelm, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val ACELM = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=acexlm, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=acexlm, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val ACEXLM = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=aka, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=aka, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AKA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=alicee, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=alicee, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val ALICEE = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=alphaamz, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=alphaamz, width=1440,
      height=3120, dpi=560, isGoogleDevice=false).code */
      val ALPHAAMZ = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=lge, code=alphalm, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=alphalm, width=1440,
      height=3120, dpi=560, isGoogleDevice=false).code */
      val ALPHALM = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=lge, code=alphaplus, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=alphaplus, width=1440,
      height=3120, dpi=560, isGoogleDevice=false).code */
      val ALPHAPLUS = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=lge, code=altev, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=altev, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ALTEV = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=altev2, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=altev2, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ALTEV2 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=angelfish, width=360, height=360, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=angelfish, width=360,
      height=360, dpi=300, isGoogleDevice=false).code */
      val ANGELFISH = "spec:width=360,height=360,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=lge, code=anna, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=anna, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val ANNA = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=awifi, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=awifi, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val AWIFI = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=awifi070u, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=awifi070u, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val AWIFI070U = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=b1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=b1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val B1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=b1w, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=b1w, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val B1W = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=b2l, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=b2l, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val B2L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=b2lds, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=b2lds, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val B2LDS = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=b2ldsn, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=b2ldsn, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val B2LDSN = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=b2ln, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=b2ln, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val B2LN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=b2lss, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=b2lss, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val B2LSS = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=b2lssn, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=b2lssn, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val B2LSSN = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=b3, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=b3, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val B3 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=b5, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=b5, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val B5 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=b6, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=b6, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val B6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=lge, code=bass, width=320, height=320, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=bass, width=320,
      height=320, dpi=240, isGoogleDevice=false).code */
      val BASS = "spec:width=320,height=320,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=bbg, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=bbg, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BBG = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=betalm, width=1080, height=2248, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=betalm, width=1080,
      height=2248, dpi=420, isGoogleDevice=false).code */
      val BETALM = "spec:width=1080,height=2248,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=c100, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=c100, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=c100n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=c100n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C100N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=c50, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=c50, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=c50ds, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=c50ds, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C50DS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=c50n, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=c50n, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C50N = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=c70, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=c70, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C70 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=c70ds, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=c70ds, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C70DS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=c70n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=c70n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C70N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=c70w, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=c70w, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C70W = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=c90, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=c90, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C90 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=c90n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=c90n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C90N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=c90nas, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=c90nas, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C90NAS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=caymanlm, width=1080, height=2460, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=caymanlm, width=1080,
      height=2460, dpi=420, isGoogleDevice=false).code */
      val CAYMANLM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=caymanslm, width=1080, height=2460, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=caymanslm, width=1080,
      height=2460, dpi=420, isGoogleDevice=false).code */
      val CAYMANSLM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=cf, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=cf, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val CF = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=cf2, width=480, height=844, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=cf2, width=480,
      height=844, dpi=240, isGoogleDevice=false).code */
      val CF2 = "spec:width=480,height=844,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=cv1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=cv1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CV1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=cv109, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=cv109, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CV109 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=cv1s, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=cv1s, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CV1S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=cv3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=cv3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CV3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=cv3n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=cv3n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CV3N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=cv5a, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=cv5a, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val CV5A = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=cv5an, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=cv5an, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val CV5AN = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=cv7a, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=cv7a, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val CV7A = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=cv7an, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=cv7an, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val CV7AN = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=cv7as, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=cv7as, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val CV7AS = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=cv7as-pr, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=cv7as-pr, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val CV7AS_PR = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=d2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=d2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val D2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=d3, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=d3, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val D3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=dh0lm, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=dh0lm, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val DH0LM = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=DM-01G, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=DM-01G, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val DM_01G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=DM-01K, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=DM-01K, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val DM_01K = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=DM-02H, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=DM-02H, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val DM_02H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=e1q, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e1q, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val E1Q = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=e2, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e2, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val E2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=e2n, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e2n, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val E2N = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=e2nac, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e2nac, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val E2NAC = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=e2nas, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e2nas, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val E2NAS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=e2nav, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e2nav, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val E2NAV = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=e7iilte, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e7iilte, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val E7IILTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=lge, code=e7lte, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e7lte, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val E7LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=lge, code=e7wifi, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e7wifi, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val E7WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=lge, code=e8lte, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e8lte, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val E8LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=lge, code=e8wifi, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e8wifi, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val E8WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=lge, code=e9lte, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e9lte, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E9LTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=e9wifi, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e9wifi, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E9WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=e9wifin, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=e9wifin, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E9WIFIN = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=elsa, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=elsa, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val ELSA = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=f6, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=f6, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val F6 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=f70n, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=f70n, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val F70N = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=falcon, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=falcon, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val FALCON = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=fh50lm, width=1080, height=2460, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=fh50lm, width=1080,
      height=2460, dpi=420, isGoogleDevice=false).code */
      val FH50LM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=flashlm, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=flashlm, width=1440,
      height=3120, dpi=560, isGoogleDevice=false).code */
      val FLASHLM = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=lge, code=flashlmdd, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=flashlmdd, width=1440,
      height=3120, dpi=560, isGoogleDevice=false).code */
      val FLASHLMDD = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=lge, code=fx1sk, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=fx1sk, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FX1SK = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=g2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=g2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=g2m, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=g2m, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val G2M = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=g2mds, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=g2mds, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val G2MDS = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=g2mss, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=g2mss, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val G2MSS = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=g2mv, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=g2mv, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val G2MV = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=g3, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=g3, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val G3 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=g4stylus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=g4stylus, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G4STYLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=g4stylusc, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=g4stylusc, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G4STYLUSC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=g4stylusds, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=g4stylusds, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G4STYLUSDS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=g4stylusdsn, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=g4stylusdsn, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G4STYLUSDSN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=g4stylusn, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=g4stylusn, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G4STYLUSN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=g4stylusw, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=g4stylusw, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G4STYLUSW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=geefhd, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=geefhd, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val GEEFHD = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=geefhd4g, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=geefhd4g, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val GEEFHD4G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=geehdc, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=geehdc, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GEEHDC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=geehrc, width=768, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=geehrc, width=768,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GEEHRC = "spec:width=768,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=geehrc4g, width=768, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=geehrc4g, width=768,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GEEHRC4G = "spec:width=768,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=h1, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=h1, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val H1 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=hg2, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=hg2, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HG2 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=lge, code=hg2_iot, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=hg2_iot, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HG2_IOT = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=lge, code=jag3gds, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=jag3gds, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val JAG3GDS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=jag3gss, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=jag3gss, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val JAG3GSS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=jagn, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=jagn, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val JAGN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=jagnm, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=jagnm, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val JAGNM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=jettalt, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=jettalt, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val JETTALT = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=joan, width=1440, height=2880, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=joan, width=1440,
      height=2880, dpi=640, isGoogleDevice=false).code */
      val JOAN = "spec:width=1440,height=2880,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=judyln, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=judyln, width=1440,
      height=3120, dpi=560, isGoogleDevice=false).code */
      val JUDYLN = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=lge, code=judyp, width=1440, height=2880, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=judyp, width=1440,
      height=2880, dpi=560, isGoogleDevice=false).code */
      val JUDYP = "spec:width=1440,height=2880,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=lge, code=judypn, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=judypn, width=1440,
      height=3120, dpi=560, isGoogleDevice=false).code */
      val JUDYPN = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=lge, code=k5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=k5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val K5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=k5n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=k5n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val K5N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=k6b, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=k6b, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val K6B = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=k6p, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=k6p, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val K6P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=k7, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=k7, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val K7 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=k7n, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=k7n, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val K7N = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=L05E, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=L05E, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L05E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=l1e, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=l1e, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val L1E = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=l70p, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=l70p, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val L70P = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=l70pds, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=l70pds, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val L70PDS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=l70pn, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=l70pn, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val L70PN = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=l9ii, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=l9ii, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L9II = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=lenok, width=320, height=320, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=lenok, width=320,
      height=320, dpi=240, isGoogleDevice=false).code */
      val LENOK = "spec:width=320,height=320,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=liger, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=liger, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val LIGER = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=LMX130IM, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=LMX130IM, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val LMX130IM = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=LM-X440IM, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=LM-X440IM, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val LM_X440IM = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=LM-X440ZM, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=LM-X440ZM, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val LM_X440ZM = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=LM-X440ZMW, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=LM-X440ZMW, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val LM_X440ZMW = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=lo_1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=lo_1, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LO_1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=lucye, width=1440, height=2880, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=lucye, width=1440,
      height=2880, dpi=640, isGoogleDevice=false).code */
      val LUCYE = "spec:width=1440,height=2880,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=luv20ds, width=240, height=320, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=luv20ds, width=240,
      height=320, dpi=120, isGoogleDevice=false).code */
      val LUV20DS = "spec:width=240,height=320,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=lge, code=luv20ss, width=240, height=320, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=luv20ss, width=240,
      height=320, dpi=120, isGoogleDevice=false).code */
      val LUV20SS = "spec:width=240,height=320,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=lge, code=luv20ts, width=240, height=320, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=luv20ts, width=240,
      height=320, dpi=120, isGoogleDevice=false).code */
      val LUV20TS = "spec:width=240,height=320,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=lge, code=luv30ds, width=240, height=320, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=luv30ds, width=240,
      height=320, dpi=120, isGoogleDevice=false).code */
      val LUV30DS = "spec:width=240,height=320,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=lge, code=luv30ss, width=240, height=320, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=luv30ss, width=240,
      height=320, dpi=120, isGoogleDevice=false).code */
      val LUV30SS = "spec:width=240,height=320,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=lge, code=luv50ds, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=luv50ds, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LUV50DS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=luv50ss, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=luv50ss, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LUV50SS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=luv50ssn, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=luv50ssn, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LUV50SSN = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=luv80ds, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=luv80ds, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LUV80DS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=luv80ss, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=luv80ss, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LUV80SS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=luv90ds, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=luv90ds, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LUV90DS = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=luv90ss, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=luv90ss, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LUV90SS = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=lv0, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=lv0, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LV0 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=lv1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=lv1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LV1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=lv3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=lv3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LV3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=lv3n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=lv3n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LV3N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=lv517, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=lv517, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LV517 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=lv517n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=lv517n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LV517N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=lv7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=lv7, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LV7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=lv9, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=lv9, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val LV9 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=lv9n, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=lv9n, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val LV9N = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=L-01J, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=L-01J, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val L_01J = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=L-01K, width=1440, height=2880, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=L-01K, width=1440,
      height=2880, dpi=640, isGoogleDevice=false).code */
      val L_01K = "spec:width=1440,height=2880,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=L-01L, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=L-01L, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val L_01L = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=L-02K, width=1440, height=2880, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=L-02K, width=1440,
      height=2880, dpi=640, isGoogleDevice=false).code */
      val L_02K = "spec:width=1440,height=2880,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=L-03K, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=L-03K, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val L_03K = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=L-41A, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=L-41A, width=1440,
      height=3120, dpi=560, isGoogleDevice=false).code */
      val L_41A = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=lge, code=L-51A, width=1080, height=2460, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=L-51A, width=1080,
      height=2460, dpi=420, isGoogleDevice=false).code */
      val L_51A = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=L-52A, width=1080, height=2460, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=L-52A, width=1080,
      height=2460, dpi=420, isGoogleDevice=false).code */
      val L_52A = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=l_dcm, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=l_dcm, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val L_DCM = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=m1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=m1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val M1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=m13g, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=m13g, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val M13G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=m1ds, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=m1ds, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val M1DS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=m1v, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=m1v, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M1V = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=m209, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=m209, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M209 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=m209n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=m209n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M209N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=m216, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=m216, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M216 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=m216n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=m216n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M216N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=m23g, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=m23g, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M23G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=m253, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=m253, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M253 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=m253n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=m253n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M253N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=m4, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=m4, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val M4 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=mc90, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mc90, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MC90 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mc90ds, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mc90ds, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MC90DS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mcaymanlm, width=1080, height=2460, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mcaymanlm, width=1080,
      height=2460, dpi=420, isGoogleDevice=false).code */
      val MCAYMANLM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=mcv150, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mcv150, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MCV150 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mcv1s, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mcv1s, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MCV1S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mcv3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mcv3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MCV3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mcv5a, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mcv5a, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val MCV5A = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=mcv7a, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mcv7a, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val MCV7A = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=mdh10lm, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mdh10lm, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val MDH10LM = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mdh10xlm, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mdh10xlm, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val MDH10XLM = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mdh15lm, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mdh15lm, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val MDH15LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mdh30lm, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mdh30lm, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val MDH30LM = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mdh30xlm, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mdh30xlm, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val MDH30XLM = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mdh35lm, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mdh35lm, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val MDH35LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mdh40lm, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mdh40lm, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val MDH40LM = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=mdh50lm, width=1080, height=2460, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mdh50lm, width=1080,
      height=2460, dpi=420, isGoogleDevice=false).code */
      val MDH50LM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=mdh5lm, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mdh5lm, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val MDH5LM = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=me0, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=me0, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ME0 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=me1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=me1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ME1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=me1ds, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=me1ds, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ME1DS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=meh15lm, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=meh15lm, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val MEH15LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=meh20lm, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=meh20lm, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val MEH20LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=meh35lm, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=meh35lm, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val MEH35LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mfh10lm, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mfh10lm, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MFH10LM = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mh2lm, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mh2lm, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val MH2LM = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=mh3, width=1080, height=2310, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mh3, width=1080,
      height=2310, dpi=420, isGoogleDevice=false).code */
      val MH3 = "spec:width=1080,height=2310,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=mh3-pl, width=1080, height=2310, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mh3-pl, width=1080,
      height=2310, dpi=420, isGoogleDevice=false).code */
      val MH3_PL = "spec:width=1080,height=2310,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=mh4, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mh4, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val MH4 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mh4x, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mh4x, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val MH4X = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mh4-pr, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mh4-pr, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val MH4_PR = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mh5lm, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mh5lm, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val MH5LM = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mh5lm-8m, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mh5lm-8m, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val MH5LM_8M = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mhn, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mhn, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val MHN = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=mk6m, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mk6m, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MK6M = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mk6p, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mk6p, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MK6P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mk6p55, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mk6p55, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MK6P55 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mk6pn, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mk6pn, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MK6PN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mlv1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mlv1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MLV1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=mlv3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mlv3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MLV3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mlv5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mlv5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MLV5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mlv5n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mlv5n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MLV5N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mlv7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mlv7, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MLV7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mlv7n, width=720, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mlv7n, width=720,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val MLV7N = "spec:width=720,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mm1v, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mm1v, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MM1V = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mm1vn, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mm1vn, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MM1VN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mme0, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mme0, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MME0 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=mme0n, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mme0n, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MME0N = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=mmh4, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mmh4, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val MMH4 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mmh45lm, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mmh45lm, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val MMH45LM = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mmh4p, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mmh4p, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val MMH4P = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mmh4p-pr, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mmh4p-pr, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val MMH4P_PR = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mmh4x, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mmh4x, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val MMH4X = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mmh55lm, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mmh55lm, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val MMH55LM = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mmh5lm, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mmh5lm, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val MMH5LM = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=mmh6lm, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mmh6lm, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MMH6LM = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=mp1s3gds, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mp1s3gds, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MP1S3GDS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mp1s3gss, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mp1s3gss, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MP1S3GSS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mph1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mph1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MPH1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=msf3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=msf3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MSF3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=msf3n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=msf3n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MSF3N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=mth8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mth8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MTH8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=lge, code=mw41lm, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=mw41lm, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val MW41LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=my50, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=my50, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MY50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=my50ds, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=my50ds, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MY50DS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=my70, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=my70, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MY70 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=my70ds, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=my70ds, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MY70DS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=my90, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=my90, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MY90 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=my90ds, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=my90ds, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MY90DS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=narwhal, width=360, height=360, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=narwhal, width=360,
      height=360, dpi=300, isGoogleDevice=false).code */
      val NARWHAL = "spec:width=360,height=360,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=lge, code=nemo, width=480, height=480, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=nemo, width=480,
      height=480, dpi=340, isGoogleDevice=false).code */
      val NEMO = "spec:width=480,height=480,unit=px,dpi=340"

      /** DeviceSpec(manufacturer=lge, code=Neo11LM, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=Neo11LM, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val NEO11LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=Neo2ALP, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=Neo2ALP, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val NEO2ALP = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=Neo31LM, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=Neo31LM, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val NEO31LM = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=lge, code=Neo4LM, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=Neo4LM, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val NEO4LM = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=omega, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=omega, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val OMEGA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=p1, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=p1, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val P1 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=p1bds3g, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=p1bds3g, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P1BDS3G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=p1bdsn, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=p1bdsn, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P1BDSN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=p1bssn, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=p1bssn, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P1BSSN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=p1v, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=p1v, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P1V = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=ph1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=ph1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PH1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=ph1n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=ph1n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PH1N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=ph2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=ph2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PH2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=ph2n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=ph2n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PH2N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=phoenix_sprout, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=phoenix_sprout,
      width=1440, height=3120, dpi=560, isGoogleDevice=false).code */
      val PHOENIX_SPROUT = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=lge, code=pplus, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=pplus, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val PPLUS = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=rainbowlm, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=rainbowlm, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val RAINBOWLM = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=sf317, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=sf317, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SF317 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=sf340, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=sf340, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SF340 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=sf340n, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=sf340n, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SF340N = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=sjr, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=sjr, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val SJR = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=solemiolt, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=solemiolt, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SOLEMIOLT = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=swordfish, width=480, height=480, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=swordfish, width=480,
      height=480, dpi=340, isGoogleDevice=false).code */
      val SWORDFISH = "spec:width=480,height=480,unit=px,dpi=340"

      /** DeviceSpec(manufacturer=lge, code=t1lte, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=t1lte, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val T1LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=t1wifi, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=t1wifi, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val T1WIFI = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=t1wifin, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=t1wifin, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val T1WIFIN = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=t8lte, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=t8lte, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=lge, code=t8wi7u, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=t8wi7u, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8WI7U = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=lge, code=t8wifi, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=t8wifi, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=lge, code=tf10, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=tf10, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TF10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=tf10w, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=tf10w, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TF10W = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=tf840, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=tf840, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TF840 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=th10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=th10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TH10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=tiger6, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=tiger6, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val TIGER6 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=lge, code=tigers, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=tigers, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TIGERS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=timelm, width=1080, height=2460, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=timelm, width=1080,
      height=2460, dpi=420, isGoogleDevice=false).code */
      val TIMELM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=tvg2, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=tvg2, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TVG2 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=lge, code=u2, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=u2, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val U2 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=v1, width=240, height=320, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=v1, width=240,
      height=320, dpi=120, isGoogleDevice=false).code */
      val V1 = "spec:width=240,height=320,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=lge, code=v10, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=v10, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=v1ds, width=240, height=320, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=v1ds, width=240,
      height=320, dpi=120, isGoogleDevice=false).code */
      val V1DS = "spec:width=240,height=320,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=lge, code=vee3ds, width=240, height=320, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vee3ds, width=240,
      height=320, dpi=120, isGoogleDevice=false).code */
      val VEE3DS = "spec:width=240,height=320,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=lge, code=vee3e, width=240, height=320, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vee3e, width=240,
      height=320, dpi=120, isGoogleDevice=false).code */
      val VEE3E = "spec:width=240,height=320,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=lge, code=vee4ss, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vee4ss, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val VEE4SS = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=vee5ds, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vee5ds, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val VEE5DS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=vee5nfc, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vee5nfc, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val VEE5NFC = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=vee5ss, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vee5ss, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val VEE5SS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=vee7ds, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vee7ds, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val VEE7DS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=vee7e, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vee7e, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val VEE7E = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=vfp, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vfp, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val VFP = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=vfp3g, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vfp3g, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val VFP3G = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=vfpv, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vfpv, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val VFPV = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=vu2kt, width=768, height=1024, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vu2kt, width=768,
      height=1024, dpi=320, isGoogleDevice=false).code */
      val VU2KT = "spec:width=768,height=1024,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=vu2sk, width=768, height=1024, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vu2sk, width=768,
      height=1024, dpi=320, isGoogleDevice=false).code */
      val VU2SK = "spec:width=768,height=1024,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=vu3, width=960, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=vu3, width=960,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VU3 = "spec:width=960,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=w3, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w3, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val W3 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=w3c, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w3c, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val W3C = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=w3ds, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w3ds, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val W3DS = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=w3voip, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w3voip, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val W3VOIP = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=w5, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w5, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val W5 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=w55, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w55, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val W55 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=w55ds, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w55ds, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val W55DS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=w55n, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w55n, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val W55N = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=w5c, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w5c, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val W5C = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=w5ds, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w5ds, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val W5DS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=w5n, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w5n, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val W5N = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=w6, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w6, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val W6 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=w6ds, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w6ds, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val W6DS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=w7, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w7, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val W7 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=w7ds, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w7ds, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val W7DS = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=w7dsn, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w7dsn, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val W7DSN = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=w7n, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=w7n, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val W7N = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=winglm, width=1080, height=2460, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=winglm, width=1080,
      height=2460, dpi=420, isGoogleDevice=false).code */
      val WINGLM = "spec:width=1080,height=2460,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=lge, code=x10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=x10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=x5, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=x5, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val X5 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=y25, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=y25, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val Y25 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=y25c, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=y25c, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val Y25C = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=lge, code=y30, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=y30, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val Y30 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=y30dsf, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=y30dsf, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val Y30DSF = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=y30f, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=y30f, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val Y30F = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=y50, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=y50, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Y50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=y50c, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=y50c, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Y50C = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=lge, code=yg, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=yg, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YG = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=lge, code=z2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=z2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=lge, code=zee, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=lge, code=zee, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ZEE = "spec:width=720,height=1280,unit=px,dpi=320"

  }
