package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HEADWOLF device specifications for Android Compose previews.
 *
 * This extension provides HEADWOLF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HEADWOLF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HEADWOLF: Any
  get() = object {
      /** HEADWOLF F2A */
      val F2A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HEADWOLF F3A */
      val F3A = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** HEADWOLF F5A */
      val F5A = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** HEADWOLF F6 */
      val F6 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** HEADWOLF F7 */
      val F7 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** HEADWOLF Fpad1 */
      val FPAD1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** HEADWOLF Fpad2 */
      val FPAD2 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** HEADWOLF Fpad3 */
      val FPAD3 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** HEADWOLF Fpad5 */
      val FPAD5 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** HEADWOLF Hpad1 */
      val HPAD1 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** HEADWOLF HPAD1A */
      val HPAD1A = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** HEADWOLF Hpad2 */
      val HPAD2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HEADWOLF Hpad3 */
      val HPAD3 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** HEADWOLF Hpad5 */
      val HPAD5 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** HEADWOLF HPAD6 */
      val HPAD6 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** HEADWOLF W5 */
      val W5 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** HEADWOLF W5A */
      val W5A = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** HEADWOLF W6A */
      val W6A = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** HEADWOLF W7 */
      val W7 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** HEADWOLF Wpad1 */
      val WPAD1 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** HEADWOLF WPAD2 */
      val WPAD2 = "spec:width=1200,height=1920,unit=px,dpi=340"

  }
