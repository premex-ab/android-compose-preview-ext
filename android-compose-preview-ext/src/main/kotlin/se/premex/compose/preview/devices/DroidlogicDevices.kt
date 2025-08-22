package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Droidlogic device specifications for Android Compose previews.
 *
 * This extension provides Droidlogic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Droidlogic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Droidlogic: Any
  get() = object {
      /** Droidlogic ampere */
      val AMPERE = "spec:width=720,height=1280,unit=px,dpi=160"

      /** Droidlogic franklin */
      val FRANKLIN = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Droidlogic oppen */
      val OPPEN = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
