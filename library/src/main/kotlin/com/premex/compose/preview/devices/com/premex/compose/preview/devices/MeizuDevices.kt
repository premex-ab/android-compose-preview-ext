package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * meizu device specifications for Android Compose previews.
 *
 * This extension provides meizu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meizu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meizu: Any
  get() = object {
      /** DeviceSpec(manufacturer=meizu, code=meizu16sPro, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu16sPro,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val MEIZU16SPRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=meizu, code=meizu16T, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu16T, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MEIZU16T = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=meizu, code=meizu16Xs, width=1080, height=2232, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu16Xs, width=1080,
      height=2232, dpi=480, isGoogleDevice=false).code */
      val MEIZU16XS = "spec:width=1080,height=2232,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=meizu, code=meizu17, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu17, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val MEIZU17 = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=meizu, code=meizu17Pro, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu17Pro, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val MEIZU17PRO = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=meizu, code=meizu18, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu18, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val MEIZU18 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=meizu, code=meizu18Pro, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu18Pro, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val MEIZU18PRO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=meizu, code=meizu18s, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu18s, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val MEIZU18S = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=meizu, code=meizu18sPro, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu18sPro,
      width=1080, height=2400, dpi=440, isGoogleDevice=false).code */
      val MEIZU18SPRO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=meizu, code=meizu18X, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu18X, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val MEIZU18X = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=meizu, code=meizu20, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu20, width=1080,
      height=2400, dpi=450, isGoogleDevice=false).code */
      val MEIZU20 = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=meizu, code=meizu20Inf, width=1368, height=3192, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu20Inf, width=1368,
      height=3192, dpi=560, isGoogleDevice=false).code */
      val MEIZU20INF = "spec:width=1368,height=3192,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=meizu, code=meizu20Pro, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu20Pro, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val MEIZU20PRO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=meizu, code=meizu21, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu21, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val MEIZU21 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=meizu, code=Meizu21Note, width=1264, height=2780, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=Meizu21Note,
      width=1264, height=2780, dpi=520, isGoogleDevice=false).code */
      val MEIZU21NOTE = "spec:width=1264,height=2780,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=meizu, code=meizu21Pro, width=1368, height=3192, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizu21Pro, width=1368,
      height=3192, dpi=480, isGoogleDevice=false).code */
      val MEIZU21PRO = "spec:width=1368,height=3192,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=meizu, code=meizuM10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizuM10, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MEIZUM10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=meizu, code=meizunote9, width=1080, height=2244, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=meizunote9, width=1080,
      height=2244, dpi=480, isGoogleDevice=false).code */
      val MEIZUNOTE9 = "spec:width=1080,height=2244,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=meizu, code=MEIZU_mblu, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=MEIZU_mblu, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val MEIZU_MBLU = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=meizu, code=MEIZU_Mblu22, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=MEIZU_Mblu22,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val MEIZU_MBLU22 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=meizu, code=MEIZU_Mblu22Pro, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=MEIZU_Mblu22Pro,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val MEIZU_MBLU22PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=meizu, code=MEIZU_Note21, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=MEIZU_Note21,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val MEIZU_NOTE21 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=meizu, code=MEIZU_Note21_Pro, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=MEIZU_Note21_Pro,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val MEIZU_NOTE21_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=meizu, code=Note9, width=1080, height=2244, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=Note9, width=1080,
      height=2244, dpi=480, isGoogleDevice=false).code */
      val NOTE9 = "spec:width=1080,height=2244,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=meizu, code=PolestarPhone, width=1368, height=3192, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=PolestarPhone,
      width=1368, height=3192, dpi=480, isGoogleDevice=false).code */
      val POLESTARPHONE = "spec:width=1368,height=3192,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=meizu, code=16s, width=1080, height=2232, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meizu, code=16s, width=1080,
      height=2232, dpi=480, isGoogleDevice=false).code */
      val _16S = "spec:width=1080,height=2232,unit=px,dpi=480"

  }
