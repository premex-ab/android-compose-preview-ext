package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * telcel device specifications for Android Compose previews.
 *
 * This extension provides telcel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telcel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telcel: Any
  get() = object {
      /** telcel i50F */
      val I50F = "spec:width=480,height=854,unit=px,dpi=240"

  }
