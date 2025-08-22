package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HUGEROCK device specifications for Android Compose previews.
 *
 * This extension provides HUGEROCK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hugerock.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hugerock: Any
  get() = object {
      /** HUGEROCK E101 */
      val E101 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
