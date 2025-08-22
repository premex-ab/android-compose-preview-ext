package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SELECTRON device specifications for Android Compose previews.
 *
 * This extension provides SELECTRON device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Selectron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Selectron: Any
  get() = object {
      /** SELECTRON T856G */
      val T856G = "spec:width=800,height=1280,unit=px,dpi=240"

  }
