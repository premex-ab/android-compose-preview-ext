package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ahlo device specifications for Android Compose previews.
 *
 * This extension provides ahlo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ahlo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ahlo: Any
  get() = object {
      /** ahlo CAV */
      val CAV = "spec:width=1080,height=2408,unit=px,dpi=480"

  }
