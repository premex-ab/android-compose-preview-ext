package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BQmobile device specifications for Android Compose previews.
 *
 * This extension provides BQmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bqmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bqmobile: Any
  get() = object {
      /** BQmobile BQ6761 */
      val BQ6761 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** BQmobile BQ6861L */
      val BQ6861L = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
