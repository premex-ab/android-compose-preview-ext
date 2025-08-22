package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DENKA device specifications for Android Compose previews.
 *
 * This extension provides DENKA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Denka.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Denka: Any
  get() = object {
      /** DENKA R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DENKA R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DENKA tcl_eu */
      val TCL_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
