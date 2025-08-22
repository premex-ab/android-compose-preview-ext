package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ABIL device specifications for Android Compose previews.
 *
 * This extension provides ABIL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Abil.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Abil: Any
  get() = object {
      /** ABIL A8 */
      val A8 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
