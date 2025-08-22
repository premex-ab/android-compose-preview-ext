package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUNMI device specifications for Android Compose previews.
 *
 * This extension provides SUNMI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUNMI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUNMI: Any
  get() = object {
      /** SUNMI D3MINI */
      val D3MINI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SUNMI D3_PRO */
      val D3_PRO = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** SUNMI K2 */
      val K2 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** SUNMI SUNMI-L2HNFC */
      val SUNMI_L2HNFC = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SUNMI SUNMI-L2KsNFC */
      val SUNMI_L2KSNFC = "spec:width=480,height=800,unit=px,dpi=240"

      /** SUNMI SUNMI-L2s_PRO */
      val SUNMI_L2S_PRO = "spec:width=720,height=1440,unit=px,dpi=280"

      /** SUNMI T3_PRO */
      val T3_PRO = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** SUNMI V2s */
      val V2S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SUNMI V2sNC */
      val V2SNC = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SUNMI V2sPLUSNC */
      val V2SPLUSNC = "spec:width=720,height=1520,unit=px,dpi=320"

      /** SUNMI V3 */
      val V3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SUNMI V3_MIX */
      val V3_MIX = "spec:width=800,height=1280,unit=px,dpi=160"

  }
