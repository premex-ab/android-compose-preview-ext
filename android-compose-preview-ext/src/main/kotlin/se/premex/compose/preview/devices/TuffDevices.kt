package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TUFF device specifications for Android Compose previews.
 *
 * This extension provides TUFF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tuff.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tuff: Any
  get() = object {
      /** TUFF T500 */
      val T500 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
