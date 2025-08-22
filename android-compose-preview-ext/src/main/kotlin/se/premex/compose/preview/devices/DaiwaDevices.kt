package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DAIWA device specifications for Android Compose previews.
 *
 * This extension provides DAIWA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Daiwa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Daiwa: Any
  get() = object {
      /** DAIWA lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
