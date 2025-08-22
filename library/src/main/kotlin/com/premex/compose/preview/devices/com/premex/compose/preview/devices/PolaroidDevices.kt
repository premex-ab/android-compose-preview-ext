package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Polaroid device specifications for Android Compose previews.
 *
 * This extension provides Polaroid device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Polaroid.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Polaroid: Any
  get() = object {
      /** DeviceSpec(manufacturer=Polaroid, code=A1000, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=A1000, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val A1000 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Polaroid, code=bangbae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=bangbae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Polaroid, code=BDL0232PR, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=BDL0232PR,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BDL0232PR = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polaroid, code=BDL1064PR001, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=BDL1064PR001,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BDL1064PR001 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polaroid, code=BDLE716PR, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=BDLE716PR,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val BDLE716PR = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Polaroid, code=BDLE716_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=BDLE716_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val BDLE716_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Polaroid, code=BDLT107, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=BDLT107, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val BDLT107 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Polaroid, code=bruno, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=bruno, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polaroid, code=Connect4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=Connect4G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val CONNECT4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Polaroid, code=ewha, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=ewha, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EWHA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polaroid, code=kenton, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=kenton, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Polaroid, code=komagome, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=komagome, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polaroid, code=L10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=L10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val L10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Polaroid, code=L9, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=L9, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val L9 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Polaroid, code=lasalle, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=lasalle, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polaroid, code=MID1064FHDP, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=MID1064FHDP,
      width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val MID1064FHDP = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polaroid, code=MID1464PR001, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=MID1464PR001,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val MID1464PR001 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Polaroid, code=MID4004JBL, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=MID4004JBL,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MID4004JBL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Polaroid, code=MID8254PR, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=MID8254PR,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MID8254PR = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Polaroid, code=Mobility3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=Mobility3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MOBILITY3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Polaroid, code=P4526A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=P4526A, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P4526A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Polaroid, code=P5006A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=P5006A, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P5006A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Polaroid, code=P5026A, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=P5026A, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val P5026A = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polaroid, code=P5046A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=P5046A, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P5046A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Polaroid, code=P5047A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=P5047A, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P5047A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Polaroid, code=P5526A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=P5526A, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P5526A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Polaroid, code=PMID7102DC, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=PMID7102DC,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val PMID7102DC = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polaroid, code=POMDTB005, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=POMDTB005,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val POMDTB005 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Polaroid, code=POMDTB006, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=POMDTB006,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val POMDTB006 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polaroid, code=POMDTB007, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=POMDTB007,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val POMDTB007 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Polaroid, code=PRO5584PGE01, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=PRO5584PGE01,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val PRO5584PGE01 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Polaroid, code=PSPCK20NA, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=PSPCK20NA,
      width=480, height=854, dpi=213, isGoogleDevice=false).code */
      val PSPCK20NA = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polaroid, code=PSPCK21NA, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=PSPCK21NA,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val PSPCK21NA = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Polaroid, code=PSPCL20A0, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=PSPCL20A0,
      width=480, height=854, dpi=213, isGoogleDevice=false).code */
      val PSPCL20A0 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polaroid, code=PSPCL30A0, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=PSPCL30A0,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val PSPCL30A0 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Polaroid, code=PSPCM20A0, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=PSPCM20A0,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val PSPCM20A0 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Polaroid, code=PSPCZ20A0, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=PSPCZ20A0,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val PSPCZ20A0 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Polaroid, code=PSPTD21NA, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=PSPTD21NA,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val PSPTD21NA = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Polaroid, code=shilin, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=shilin, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Polaroid, code=sindang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polaroid, code=sindang, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SINDANG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
