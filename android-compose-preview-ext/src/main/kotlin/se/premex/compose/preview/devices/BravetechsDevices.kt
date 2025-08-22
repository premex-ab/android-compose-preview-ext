package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BraveTechs device specifications for Android Compose previews.
 *
 * This extension provides BraveTechs device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bravetechs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bravetechs: Any
  get() = object {
      /** BraveTechs T3_Pro */
      val T3_PRO = "spec:width=800,height=1280,unit=px,dpi=180"

  }
