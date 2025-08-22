package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * STC device specifications for Android Compose previews.
 *
 * This extension provides STC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Stc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Stc: Any
  get() = object {
      /** STC SEI560STC */
      val SEI560STC = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
