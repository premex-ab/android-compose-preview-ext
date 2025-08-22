package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EANCOM device specifications for Android Compose previews.
 *
 * This extension provides EANCOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Eancom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Eancom: Any
  get() = object {
      /** EANCOM PIXBA2019 */
      val PIXBA2019 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
