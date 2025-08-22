package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ERITO device specifications for Android Compose previews.
 *
 * This extension provides ERITO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Erito.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Erito: Any
  get() = object {
      /** ERITO R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
