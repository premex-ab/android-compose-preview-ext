package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vestel device specifications for Android Compose previews.
 *
 * This extension provides Vestel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vestel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vestel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Vestel, code=Ada, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Ada, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ADA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=AdaGo, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=AdaGo, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ADAGO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=Arya, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Arya, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ARYA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=ATLAS, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=ATLAS, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ATLAS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vestel, code=Cunda, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Cunda, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val CUNDA = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vestel, code=DynoLight, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=DynoLight, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DYNOLIGHT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=EKVATOR, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=EKVATOR, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val EKVATOR = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Vestel, code=Leo, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Leo, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LEO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=Leo_2GB, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Leo_2GB, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LEO_2GB = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=Lodos, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Lodos, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val LODOS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=MB300, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=MB300, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MB300 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=Orsa, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Orsa, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ORSA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vestel, code=Pardus, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Pardus, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val PARDUS = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=Pars, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Pars, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PARS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=Poyraz, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Poyraz, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val POYRAZ = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vestel, code=Reys, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Reys, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val REYS = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Vestel, code=Riga, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Riga, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RIGA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=Samos, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Samos, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SAMOS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=shandao, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=shandao, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SHANDAO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=Teos, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Teos, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TEOS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=Troia, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Troia, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val TROIA = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vestel, code=Truva, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Truva, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TRUVA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=V4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=V4, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=Venus_V3_5040, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Venus_V3_5040,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val VENUS_V3_5040 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=Venus_V3_5045, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Venus_V3_5045,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val VENUS_V3_5045 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vestel, code=Venus_V3_5070, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Venus_V3_5070,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val VENUS_V3_5070 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vestel, code=Venus_V3_5570, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=Venus_V3_5570,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val VENUS_V3_5570 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vestel, code=VTab7010, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=VTab7010, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val VTAB7010 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vestel, code=yeoksam, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vestel, code=yeoksam, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YEOKSAM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
