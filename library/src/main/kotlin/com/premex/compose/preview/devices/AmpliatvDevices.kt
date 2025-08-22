package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ampliatv device specifications for Android Compose previews.
 *
 * This extension provides ampliatv device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ampliatv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ampliatv: Any
  get() = object {
      /** ampliatv sti6160d327 */
      val STI6160D327 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
