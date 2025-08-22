package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GPLUS device specifications for Android Compose previews.
 *
 * This extension provides GPLUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GPLUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GPLUS: Any
  get() = object {
      /** GPLUS GNE-N001S */
      val GNE_N001S = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** GPLUS GNE_N003S */
      val GNE_N003S = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** GPLUS GPLUS_A2_Plus */
      val GPLUS_A2_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GPLUS GPLUS_FW6950 */
      val GPLUS_FW6950 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
