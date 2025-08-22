package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * STE device specifications for Android Compose previews.
 *
 * This extension provides STE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ste.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ste: Any
  get() = object {
      /** STE S11 */
      val S11 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
