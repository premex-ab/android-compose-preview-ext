package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Turbopad device specifications for Android Compose previews.
 *
 * This extension provides Turbopad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Turbopad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Turbopad: Any
  get() = object {
      /** Turbopad Dream */
      val DREAM = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Turbopad Turbopad1015NEW */
      val TURBOPAD1015NEW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Turbopad Turbopad1016NEW */
      val TURBOPAD1016NEW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Turbopad TurboPadPro */
      val TURBOPADPRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
