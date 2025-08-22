package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BVS device specifications for Android Compose previews.
 *
 * This extension provides BVS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bvs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bvs: Any
  get() = object {
      /** BVS SFO */
      val SFO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
