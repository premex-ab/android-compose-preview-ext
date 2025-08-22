package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SBM device specifications for Android Compose previews.
 *
 * This extension provides SBM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SBM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SBM: Any
  get() = object {
      /** DeviceSpec(manufacturer=SBM, code=DM016SH, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=DM016SH, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val DM016SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SBM, code=e2jps, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=e2jps, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E2JPS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SBM, code=HWCPN-Q, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=HWCPN-Q, width=1200,
      height=1920, dpi=360, isGoogleDevice=false).code */
      val HWCPN_Q = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=SBM, code=hwfdr, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=hwfdr, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val HWFDR = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SBM, code=hws10231l, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=hws10231l, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HWS10231L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SBM, code=msm8974, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=msm8974, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MSM8974 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SBM, code=P809F10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=P809F10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P809F10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SBM, code=SBM200SH, width=720, height=1184, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=SBM200SH, width=720,
      height=1184, dpi=320, isGoogleDevice=false).code */
      val SBM200SH = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SBM, code=SBM203SH, width=720, height=1184, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=SBM203SH, width=720,
      height=1184, dpi=320, isGoogleDevice=false).code */
      val SBM203SH = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SBM, code=SBM205SH, width=480, height=782, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=SBM205SH, width=480,
      height=782, dpi=240, isGoogleDevice=false).code */
      val SBM205SH = "spec:width=480,height=782,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SBM, code=SBM206SH, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=SBM206SH, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SBM206SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SBM, code=SBM301F, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=SBM301F, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SBM301F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SBM, code=SBM302SH, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=SBM302SH, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SBM302SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SBM, code=SBM303SH, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=SBM303SH, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SBM303SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SBM, code=SBM801FJ, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=SBM801FJ, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SBM801FJ = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SBM, code=WX04SH, width=480, height=782, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=WX04SH, width=480,
      height=782, dpi=240, isGoogleDevice=false).code */
      val WX04SH = "spec:width=480,height=782,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SBM, code=WX10K, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=WX10K, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val WX10K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SBM, code=ZTE-402ZT, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=ZTE-402ZT, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ZTE_402ZT = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SBM, code=302KC, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=302KC, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val _302KC = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SBM, code=401SO, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=401SO, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val _401SO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SBM, code=403SC, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=403SC, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val _403SC = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SBM, code=404SC, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=404SC, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val _404SC = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=SBM, code=601LV, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=601LV, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val _601LV = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SBM, code=602LV, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SBM, code=602LV, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val _602LV = "spec:width=800,height=1280,unit=px,dpi=213"

  }
