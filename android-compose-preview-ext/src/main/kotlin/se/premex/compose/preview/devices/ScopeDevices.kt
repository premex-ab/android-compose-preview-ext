package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SCOPE device specifications for Android Compose previews.
 *
 * This extension provides SCOPE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Scope.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Scope: Any
  get() = object {
      /** SCOPE F5O3V */
      val F5O3V = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SCOPE SP1089 */
      val SP1089 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
