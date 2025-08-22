package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Tomstar device specifications for Android Compose previews.
 *
 * This extension provides Tomstar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tomstar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tomstar: Any
  get() = object {
      /** Tomstar A1000 */
      val A1000 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Tomstar A1020 */
      val A1020 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Tomstar A1110 */
      val A1110 = "spec:width=800,height=1280,unit=px,dpi=204"

  }
