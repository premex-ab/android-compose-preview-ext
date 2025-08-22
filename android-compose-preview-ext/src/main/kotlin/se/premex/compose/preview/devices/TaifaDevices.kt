package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TAIFA device specifications for Android Compose previews.
 *
 * This extension provides TAIFA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Taifa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Taifa: Any
  get() = object {
      /** TAIFA TL1B_68 */
      val TL1B_68 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
