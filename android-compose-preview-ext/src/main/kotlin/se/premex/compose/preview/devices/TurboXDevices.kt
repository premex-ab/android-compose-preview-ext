package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Turbo-X device specifications for Android Compose previews.
 *
 * This extension provides Turbo-X device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TurboX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TurboX: Any
  get() = object {
      /** Turbo-X Aqua */
      val AQUA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Turbo-X Fire */
      val FIRE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Turbo-X Fire_II_WiFi */
      val FIRE_II_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

  }
