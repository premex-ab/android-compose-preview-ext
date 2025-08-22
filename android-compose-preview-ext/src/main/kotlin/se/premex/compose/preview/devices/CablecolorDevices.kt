package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Cablecolor device specifications for Android Compose previews.
 *
 * This extension provides Cablecolor device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cablecolor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cablecolor: Any
  get() = object {
      /** Cablecolor GIU3A00 */
      val GIU3A00 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
