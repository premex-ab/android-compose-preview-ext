package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Bundy device specifications for Android Compose previews.
 *
 * This extension provides Bundy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bundy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bundy: Any
  get() = object {
      /** Bundy BTOUCH7_PLUS */
      val BTOUCH7_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
