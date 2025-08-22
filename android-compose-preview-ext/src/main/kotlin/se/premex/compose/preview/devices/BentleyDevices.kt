package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BENTLEY device specifications for Android Compose previews.
 *
 * This extension provides BENTLEY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bentley.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bentley: Any
  get() = object {
      /** BENTLEY sdis1 */
      val SDIS1 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
