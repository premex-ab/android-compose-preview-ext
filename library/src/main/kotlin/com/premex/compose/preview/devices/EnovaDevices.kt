package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * enova device specifications for Android Compose previews.
 *
 * This extension provides enova device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Enova.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Enova: Any
  get() = object {
      /** enova N50 */
      val N50 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** enova N51 */
      val N51 = "spec:width=720,height=1600,unit=px,dpi=480"

  }
