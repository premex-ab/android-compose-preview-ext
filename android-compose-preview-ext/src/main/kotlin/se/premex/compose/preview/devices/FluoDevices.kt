package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * fluo device specifications for Android Compose previews.
 *
 * This extension provides fluo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fluo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fluo: Any
  get() = object {
      /** fluo N */
      val N = "spec:width=720,height=1498,unit=px,dpi=320"

      /** fluo X2_Max */
      val X2_MAX = "spec:width=720,height=1500,unit=px,dpi=320"

  }
