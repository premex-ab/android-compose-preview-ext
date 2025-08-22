package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * JCI_JP device specifications for Android Compose previews.
 *
 * This extension provides JCI_JP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JciJp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JciJp: Any
  get() = object {
      /** JCI_JP VA-10J */
      val VA_10J = "spec:width=720,height=1280,unit=px,dpi=320"

  }
