package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SANYO device specifications for Android Compose previews.
 *
 * This extension provides SANYO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sanyo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sanyo: Any
  get() = object {
      /** SANYO R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SANYO R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SANYO tcl_eu */
      val TCL_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
