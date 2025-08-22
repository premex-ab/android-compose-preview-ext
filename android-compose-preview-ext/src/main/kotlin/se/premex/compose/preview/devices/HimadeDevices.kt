package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HIMADE device specifications for Android Compose previews.
 *
 * This extension provides HIMADE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Himade.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Himade: Any
  get() = object {
      /** HIMADE shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** HIMADE sindorim */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
