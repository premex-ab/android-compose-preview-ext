package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Grunhelm device specifications for Android Compose previews.
 *
 * This extension provides Grunhelm device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Grunhelm.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Grunhelm: Any
  get() = object {
      /** Grunhelm ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Grunhelm longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Grunhelm redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Grunhelm samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
