package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Hamlet device specifications for Android Compose previews.
 *
 * This extension provides Hamlet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hamlet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hamlet: Any
  get() = object {
      /** Hamlet XZPAD412LTE */
      val XZPAD412LTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Hamlet XZPAD412W */
      val XZPAD412W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hamlet XZPAD414W */
      val XZPAD414W = "spec:width=800,height=1280,unit=px,dpi=160"

  }
