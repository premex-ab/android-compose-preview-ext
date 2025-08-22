package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ASUS device specifications for Android Compose previews.
 *
 * This extension provides ASUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Asus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Asus: Any
  get() = object {
      /** ASUS dahu */
      val DAHU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
