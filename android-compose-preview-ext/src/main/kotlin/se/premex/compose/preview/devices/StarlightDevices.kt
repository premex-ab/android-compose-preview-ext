package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * STARLIGHT device specifications for Android Compose previews.
 *
 * This extension provides STARLIGHT device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Starlight.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Starlight: Any
  get() = object {
      /** STARLIGHT tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** STARLIGHT VENUS_PLUS */
      val VENUS_PLUS = "spec:width=442,height=960,unit=px,dpi=240"

      /** STARLIGHT yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
