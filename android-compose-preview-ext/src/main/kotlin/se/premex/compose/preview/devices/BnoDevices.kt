package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BNO device specifications for Android Compose previews.
 *
 * This extension provides BNO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bno.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bno: Any
  get() = object {
      /** BNO bno_MT5593Uplus_EU */
      val BNO_MT5593UPLUS_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
