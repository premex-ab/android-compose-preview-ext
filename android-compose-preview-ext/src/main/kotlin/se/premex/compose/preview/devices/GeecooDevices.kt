package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GEECOO device specifications for Android Compose previews.
 *
 * This extension provides GEECOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Geecoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Geecoo: Any
  get() = object {
      /** GEECOO G4 */
      val G4 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
