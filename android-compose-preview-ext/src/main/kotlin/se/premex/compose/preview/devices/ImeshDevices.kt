package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * iMESH device specifications for Android Compose previews.
 *
 * This extension provides iMESH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Imesh.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Imesh: Any
  get() = object {
      /** iMESH IM-560 */
      val IM_560 = "spec:width=480,height=800,unit=px,dpi=200"

  }
