package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * kiddoboo device specifications for Android Compose previews.
 *
 * This extension provides kiddoboo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kiddoboo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kiddoboo: Any
  get() = object {
      /** kiddoboo KB101 */
      val KB101 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
