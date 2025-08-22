package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * mMax device specifications for Android Compose previews.
 *
 * This extension provides mMax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mmax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mmax: Any
  get() = object {
      /** mMax M55 */
      val M55 = "spec:width=480,height=800,unit=px,dpi=240"

  }
