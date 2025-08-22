package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CAT device specifications for Android Compose previews.
 *
 * This extension provides CAT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cat: Any
  get() = object {
      /** CAT TOUGH */
      val TOUGH = "spec:width=480,height=800,unit=px,dpi=240"

  }
