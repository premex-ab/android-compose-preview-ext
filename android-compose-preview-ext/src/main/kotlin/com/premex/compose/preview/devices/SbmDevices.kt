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
 * @Preview(device = Devices.Sbm.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sbm: Any
  get() = object {
      /** SBM DM016SH */
      val DM016SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SBM e2jps */
      val E2JPS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SBM HWCPN-Q */
      val HWCPN_Q = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** SBM hwfdr */
      val HWFDR = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** SBM hws10231l */
      val HWS10231L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SBM msm8974 */
      val MSM8974 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SBM P809F10 */
      val P809F10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SBM SBM200SH */
      val SBM200SH = "spec:width=720,height=1184,unit=px,dpi=320"

      /** SBM SBM203SH */
      val SBM203SH = "spec:width=720,height=1184,unit=px,dpi=320"

      /** SBM SBM205SH */
      val SBM205SH = "spec:width=480,height=782,unit=px,dpi=240"

      /** SBM SBM206SH */
      val SBM206SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SBM SBM301F */
      val SBM301F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SBM SBM302SH */
      val SBM302SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SBM SBM303SH */
      val SBM303SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SBM SBM801FJ */
      val SBM801FJ = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SBM WX04SH */
      val WX04SH = "spec:width=480,height=782,unit=px,dpi=240"

      /** SBM WX10K */
      val WX10K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SBM ZTE-402ZT */
      val ZTE_402ZT = "spec:width=480,height=854,unit=px,dpi=240"

      /** SBM 302KC */
      val _302KC = "spec:width=540,height=960,unit=px,dpi=240"

      /** SBM 401SO */
      val _401SO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SBM 403SC */
      val _403SC = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SBM 404SC */
      val _404SC = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** SBM 601LV */
      val _601LV = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SBM 602LV */
      val _602LV = "spec:width=800,height=1280,unit=px,dpi=213"

  }
