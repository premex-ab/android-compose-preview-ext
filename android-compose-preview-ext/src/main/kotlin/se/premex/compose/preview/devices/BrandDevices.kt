package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * brand device specifications for Android Compose previews.
 *
 * This extension provides brand device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brand.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brand: Any
  get() = object {
      /** brand device */
      val DEVICE = "spec:width=600,height=1024,unit=px,dpi=190"

  }
