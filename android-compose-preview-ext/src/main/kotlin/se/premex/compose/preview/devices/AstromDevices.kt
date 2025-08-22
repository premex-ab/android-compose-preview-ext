package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ASTROM device specifications for Android Compose previews.
 *
 * This extension provides ASTROM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Astrom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Astrom: Any
  get() = object {
      /** ASTROM AST707G */
      val AST707G = "spec:width=600,height=1024,unit=px,dpi=213"

  }
